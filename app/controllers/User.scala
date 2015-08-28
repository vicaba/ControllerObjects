package controllers

import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.mvc._
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

object User {

  // forms, implicits, helper methods....
  def userForm = Form(
    tuple(
      "email" -> email,
      "passwd" -> nonEmptyText
    )
  )
}

class User extends Controller {

  def home = Action {
    Redirect(routes.User.someAction)
  }

  def someAction = Action {
    Ok(views.html.index("Your new application is ready."))
  }

}
