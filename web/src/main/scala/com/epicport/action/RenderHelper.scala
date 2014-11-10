package com.epicport.action

import xitrum.Action
import com.epicport.i18n.I18N

trait RenderHelper extends Action {

  import I18N._
  
  def renderAlternateUris() = {
    val altUri = alternateUri(request.getUri)
    val links = languages.filter(_ != language).map { lang =>
      <link rel="alternate" hreflang={ lang } href={ altUri(lang) } />
    }
    links.mkString
  }
  
//    <meta name="author" content="Guryanov Aleksander" />  
//    <meta name="description" content="${description}" />
//    <meta name="keywords" content="${keywords}" />
  
}