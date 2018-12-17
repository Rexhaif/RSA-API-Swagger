package io.swagger.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import io.swagger.server.api.AdminApi
import io.swagger.server.api.ManageDocsApi
import io.swagger.server.api.ManageOrgsApi
import io.swagger.server.api.ReadDocsApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

class Controller(admin: AdminApi, manageDocs: ManageDocsApi, manageOrgs: ManageOrgsApi, readDocs: ReadDocsApi)(implicit system: ActorSystem, materializer: ActorMaterializer) {

    lazy val routes: Route = admin.route ~ manageDocs.route ~ manageOrgs.route ~ readDocs.route 

    Http().bindAndHandle(routes, "0.0.0.0", 9000)
}