/* 
 *
 * 
 *
 *
 * Less painful Android development with Scala
 *
 * http://scaloid.org
 *
 *
 *
 *
 *
 *
 * Copyright 2013 Sung-Ho Lee and Scaloid team
 *
 * Sung-Ho Lee and Scaloid team licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/*
 * This file is automatically generated. Any changes on this file will be OVERWRITTEN!
 * To learn how to contribute, please refer to:
 * https://github.com/pocorall/scaloid/wiki/Inside-Scaloid
 */

package org.scaloid.common

import android.content.{Context, SharedPreferences}
import scala.collection.JavaConversions._
import scala.language.dynamics
import scala.reflect._

@deprecated("Use Preferences instead. This will be removed from Scaloid 3.0.", "2.0")
class StringPreferences(preferences: SharedPreferences) extends Dynamic {
  var defaultValue: String = _

  def selectDynamic(name: String): String = preferences.getString(name, defaultValue)

  def applyDynamic(name: String)(defaultVal: String): String = preferences.getString(name, defaultVal)
}

@deprecated("Use Preferences instead. This will be removed from Scaloid 3.0.", "2.0")
class IntPreferences(preferences: SharedPreferences) extends Dynamic {
  var defaultValue: Int = _

  def selectDynamic(name: String): Int = preferences.getInt(name, defaultValue)

  def updateDynamic(name: String)(value: Int) {
    preferences.edit().putInt(name, value).commit()
  }

  def applyDynamic(name: String)(defaultVal: Int): Int = preferences.getInt(name, defaultVal)
}

@deprecated("Use Preferences instead. This will be removed from Scaloid 3.0.", "2.0")
class LongPreferences(preferences: SharedPreferences) extends Dynamic {
  var defaultValue: Long = _

  def selectDynamic(name: String): Long = preferences.getLong(name, defaultValue)

  def applyDynamic(name: String)(defaultVal: Long): Long = preferences.getLong(name, defaultVal)
}

@deprecated("Use Preferences instead. This will be removed from Scaloid 3.0.", "2.0")
class FloatPreferences(preferences: SharedPreferences) extends Dynamic {
  var defaultValue: Float = _

  def selectDynamic(name: String): Float = preferences.getFloat(name, defaultValue)

  def applyDynamic(name: String)(defaultVal: Float): Float = preferences.getFloat(name, defaultVal)

}

@deprecated("Use Preferences instead. This will be removed from Scaloid 3.0.", "2.0")
class BooleanPreferences(preferences: SharedPreferences) extends Dynamic {
  var defaultValue: Boolean = _

  def selectDynamic(name: String): Boolean = preferences.getBoolean(name, defaultValue)

  def applyDynamic(name: String)(defaultVal: Boolean): Boolean = preferences.getBoolean(name, defaultVal)
}

/**
 * An accessor of SharedPreferences.
 *
 * {{{
 *   val pref = Preferences
 *   val ec = pref.executionCount(0)
 *   pref.executionCount = ec + 1
 * }}}
 *
 * Refer to the URL below for more details.
 *
 * [[http://blog.scaloid.org/2013/03/dynamicly-accessing-sharedpreferences.html]]
 *
 * @param preferences
 */
class Preferences(val preferences: SharedPreferences) extends Dynamic {

  def updateDynamic(name: String)(value: Any) {
    value match {
      case v: String => preferences.edit().putString(name, v).commit()
      case v: Int => preferences.edit().putInt(name, v).commit()
      case v: Long => preferences.edit().putLong(name, v).commit()
      case v: Boolean => preferences.edit().putBoolean(name, v).commit()
      case v: Float => preferences.edit().putFloat(name, v).commit()
    }
  }

  def applyDynamic[T](name: String)(defaultVal: T): T = defaultVal match {
    case v: String => preferences.getString(name, v).asInstanceOf[T]
    case v: Int => preferences.getInt(name, v).asInstanceOf[T]
    case v: Long => preferences.getLong(name, v).asInstanceOf[T]
    case v: Boolean => preferences.getBoolean(name, v).asInstanceOf[T]
    case v: Float => preferences.getFloat(name, v).asInstanceOf[T]
  }

  def remove(name: String) {
    preferences.edit().remove(name).commit()
  }

  @deprecated("Use Preferences instead. This will be removed from Scaloid 3.0.", "2.0")
  val String = new StringPreferences(preferences)
  @deprecated("Use Preferences instead. This will be removed from Scaloid 3.0.", "2.0")
  val Int = new IntPreferences(preferences)
  @deprecated("Use Preferences instead. This will be removed from Scaloid 3.0.", "2.0")
  val Long = new LongPreferences(preferences)
  @deprecated("Use Preferences instead. This will be removed from Scaloid 3.0.", "2.0")
  val Float = new FloatPreferences(preferences)
  @deprecated("Use Preferences instead. This will be removed from Scaloid 3.0.", "2.0")
  val Boolean = new BooleanPreferences(preferences)
}

object Preferences {
  def apply()(implicit ctx: Context) = new Preferences(defaultSharedPreferences)
}


/**
 * Automatically generated enriching class of `[[https://developer.android.com/reference/android/preference/Preference.html android.preference.Preference]]`.
 */
class RichPreference[V <: android.preference.Preference](val basis: V) extends TraitPreference[V]

/**
 * Automatically generated helper trait of `[[https://developer.android.com/reference/android/preference/Preference.html android.preference.Preference]]`. This contains several property accessors.
 */
trait TraitPreference[V <: android.preference.Preference] {

  def basis: V



  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getContext() getContext()]]`
   */
  @inline def context = basis.getContext


  @inline def defaultValue(implicit no: NoGetterForThisProperty): Nothing = throw new Error("Android does not support the getter for 'defaultValue'")
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setDefaultValue(java.lang.Object) setDefaultValue(java.lang.Object)]]`
   */@inline def defaultValue  (p: Any) =            defaultValue_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setDefaultValue(java.lang.Object) setDefaultValue(java.lang.Object)]]`
   */@inline def defaultValue_=(p: Any) = { basis.setDefaultValue    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getDependency() getDependency()]]`
   */
  @inline def dependency = basis.getDependency
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setDependency(java.lang.String) setDependency(java.lang.String)]]`
   */@inline def dependency  (p: java.lang.String) =            dependency_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setDependency(java.lang.String) setDependency(java.lang.String)]]`
   */@inline def dependency_=(p: java.lang.String) = { basis.setDependency    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getEditor() getEditor()]]`
   */
  @inline def editor = basis.getEditor


  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#isEnabled() isEnabled()]]`
   */
  @inline def enabled = basis.isEnabled
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setEnabled(boolean) setEnabled(boolean)]]`
   */@inline def enabled  (p: Boolean) =            enabled_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setEnabled(boolean) setEnabled(boolean)]]`
   */@inline def enabled_=(p: Boolean) = { basis.setEnabled    (p); basis }
  @inline def  enable               = { basis.setEnabled(true ); basis }
  @inline def disable               = { basis.setEnabled(false); basis }


  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getIntent() getIntent()]]`
   */
  @inline def intent = basis.getIntent
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setIntent(android.content.Intent) setIntent(android.content.Intent)]]`
   */@inline def intent  (p: android.content.Intent) =            intent_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setIntent(android.content.Intent) setIntent(android.content.Intent)]]`
   */@inline def intent_=(p: android.content.Intent) = { basis.setIntent    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getKey() getKey()]]`
   */
  @inline def key = basis.getKey
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setKey(java.lang.String) setKey(java.lang.String)]]`
   */@inline def key  (p: java.lang.String) =            key_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setKey(java.lang.String) setKey(java.lang.String)]]`
   */@inline def key_=(p: java.lang.String) = { basis.setKey    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getLayoutResource() getLayoutResource()]]`
   */
  @inline def layoutResource = basis.getLayoutResource
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setLayoutResource(int) setLayoutResource(int)]]`
   */@inline def layoutResource  (p: Int) =            layoutResource_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setLayoutResource(int) setLayoutResource(int)]]`
   */@inline def layoutResource_=(p: Int) = { basis.setLayoutResource    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getOnPreferenceChangeListener() getOnPreferenceChangeListener()]]`
   */
  @inline def onPreferenceChangeListener = basis.getOnPreferenceChangeListener
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setOnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener) setOnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener)]]`
   */@inline def onPreferenceChangeListener  (p: android.preference.Preference.OnPreferenceChangeListener) =            onPreferenceChangeListener_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setOnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener) setOnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener)]]`
   */@inline def onPreferenceChangeListener_=(p: android.preference.Preference.OnPreferenceChangeListener) = { basis.setOnPreferenceChangeListener    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getOnPreferenceClickListener() getOnPreferenceClickListener()]]`
   */
  @inline def onPreferenceClickListener = basis.getOnPreferenceClickListener
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setOnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener) setOnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener)]]`
   */@inline def onPreferenceClickListener  (p: android.preference.Preference.OnPreferenceClickListener) =            onPreferenceClickListener_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setOnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener) setOnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener)]]`
   */@inline def onPreferenceClickListener_=(p: android.preference.Preference.OnPreferenceClickListener) = { basis.setOnPreferenceClickListener    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getOrder() getOrder()]]`
   */
  @inline def order = basis.getOrder
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setOrder(int) setOrder(int)]]`
   */@inline def order  (p: Int) =            order_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setOrder(int) setOrder(int)]]`
   */@inline def order_=(p: Int) = { basis.setOrder    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#isPersistent() isPersistent()]]`
   */
  @inline def persistent = basis.isPersistent
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setPersistent(boolean) setPersistent(boolean)]]`
   */@inline def persistent  (p: Boolean) =            persistent_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setPersistent(boolean) setPersistent(boolean)]]`
   */@inline def persistent_=(p: Boolean) = { basis.setPersistent    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getPreferenceManager() getPreferenceManager()]]`
   */
  @inline def preferenceManager = basis.getPreferenceManager


  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#isSelectable() isSelectable()]]`
   */
  @inline def selectable = basis.isSelectable
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setSelectable(boolean) setSelectable(boolean)]]`
   */@inline def selectable  (p: Boolean) =            selectable_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setSelectable(boolean) setSelectable(boolean)]]`
   */@inline def selectable_=(p: Boolean) = { basis.setSelectable    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getSharedPreferences() getSharedPreferences()]]`
   */
  @inline def sharedPreferences = basis.getSharedPreferences


  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getShouldDisableView() getShouldDisableView()]]`
   */
  @inline def shouldDisableView = basis.getShouldDisableView
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setShouldDisableView(boolean) setShouldDisableView(boolean)]]`
   */@inline def shouldDisableView  (p: Boolean) =            shouldDisableView_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setShouldDisableView(boolean) setShouldDisableView(boolean)]]`
   */@inline def shouldDisableView_=(p: Boolean) = { basis.setShouldDisableView    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getSummary() getSummary()]]`
   */
  @inline def summary = basis.getSummary
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setSummary(int) setSummary(int)]]`
   */@inline def summary  (p: Int) =            summary_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setSummary(int) setSummary(int)]]`
   */@inline def summary_=(p: Int) = { basis.setSummary    (p); basis }
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setSummary(java.lang.CharSequence) setSummary(java.lang.CharSequence)]]`
   */@inline def summary  (p: java.lang.CharSequence) =            summary_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setSummary(java.lang.CharSequence) setSummary(java.lang.CharSequence)]]`
   */@inline def summary_=(p: java.lang.CharSequence) = { basis.setSummary    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getTitle() getTitle()]]`
   */
  @inline def title = basis.getTitle
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setTitle(int) setTitle(int)]]`
   */@inline def title  (p: Int) =            title_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setTitle(int) setTitle(int)]]`
   */@inline def title_=(p: Int) = { basis.setTitle    (p); basis }
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setTitle(java.lang.CharSequence) setTitle(java.lang.CharSequence)]]`
   */@inline def title  (p: java.lang.CharSequence) =            title_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setTitle(java.lang.CharSequence) setTitle(java.lang.CharSequence)]]`
   */@inline def title_=(p: java.lang.CharSequence) = { basis.setTitle    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#getWidgetLayoutResource() getWidgetLayoutResource()]]`
   */
  @inline def widgetLayoutResource = basis.getWidgetLayoutResource
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setWidgetLayoutResource(int) setWidgetLayoutResource(int)]]`
   */@inline def widgetLayoutResource  (p: Int) =            widgetLayoutResource_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/Preference.html#setWidgetLayoutResource(int) setWidgetLayoutResource(int)]]`
   */@inline def widgetLayoutResource_=(p: Int) = { basis.setWidgetLayoutResource    (p); basis }

  @inline def onPreferenceChange(f: (android.preference.Preference, Any) => Boolean): V = {
    basis.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener {
      def onPreferenceChange(p1: android.preference.Preference, p2: Any): Boolean = { f(p1, p2) }
    })
    basis
  }

  @inline def onPreferenceChange(f: => Boolean): V = {
    basis.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener {
      def onPreferenceChange(p1: android.preference.Preference, p2: Any): Boolean = { f }
    })
    basis
  }

  @inline def onPreferenceClick(f: android.preference.Preference => Boolean): V = {
    basis.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener {
      def onPreferenceClick(p: android.preference.Preference): Boolean = { f(p) }
    })
    basis
  }

  @inline def onPreferenceClick(f: => Boolean): V = {
    basis.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener {
      def onPreferenceClick(p: android.preference.Preference): Boolean = { f }
    })
    basis
  }
  @inline def setIntent[T: ClassTag](implicit context: Context): Unit = basis.setIntent(SIntent[T])
}

/**
 * Automatically generated concrete helper class of `[[https://developer.android.com/reference/android/preference/Preference.html android.preference.Preference]]`.
 */
class SPreference()(implicit context: android.content.Context)
    extends android.preference.Preference(context) with TraitPreference[SPreference] {

  def basis = this

}

object SPreference {
  def apply()(implicit context: android.content.Context): SPreference = {
    val v = new SPreference
    v
  }

}


/**
 * Automatically generated enriching class of `[[https://developer.android.com/reference/android/preference/DialogPreference.html android.preference.DialogPreference]]`.
 */
class RichDialogPreference[V <: android.preference.DialogPreference](val basis: V) extends TraitDialogPreference[V]

/**
 * Automatically generated helper trait of `[[https://developer.android.com/reference/android/preference/DialogPreference.html android.preference.DialogPreference]]`. This contains several property accessors.
 */
trait TraitDialogPreference[V <: android.preference.DialogPreference] extends TraitPreference[V] {




  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#getDialog() getDialog()]]`
   */
  @inline def dialog = basis.getDialog


  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#getDialogIcon() getDialogIcon()]]`
   */
  @inline def dialogIcon = basis.getDialogIcon
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogIcon(int) setDialogIcon(int)]]`
   */@inline def dialogIcon  (p: Int) =            dialogIcon_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogIcon(int) setDialogIcon(int)]]`
   */@inline def dialogIcon_=(p: Int) = { basis.setDialogIcon    (p); basis }
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogIcon(android.graphics.drawable.Drawable) setDialogIcon(android.graphics.drawable.Drawable)]]`
   */@inline def dialogIcon  (p: android.graphics.drawable.Drawable) =            dialogIcon_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogIcon(android.graphics.drawable.Drawable) setDialogIcon(android.graphics.drawable.Drawable)]]`
   */@inline def dialogIcon_=(p: android.graphics.drawable.Drawable) = { basis.setDialogIcon    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#getDialogLayoutResource() getDialogLayoutResource()]]`
   */
  @inline def dialogLayoutResource = basis.getDialogLayoutResource
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogLayoutResource(int) setDialogLayoutResource(int)]]`
   */@inline def dialogLayoutResource  (p: Int) =            dialogLayoutResource_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogLayoutResource(int) setDialogLayoutResource(int)]]`
   */@inline def dialogLayoutResource_=(p: Int) = { basis.setDialogLayoutResource    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#getDialogMessage() getDialogMessage()]]`
   */
  @inline def dialogMessage = basis.getDialogMessage
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogMessage(int) setDialogMessage(int)]]`
   */@inline def dialogMessage  (p: Int) =            dialogMessage_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogMessage(int) setDialogMessage(int)]]`
   */@inline def dialogMessage_=(p: Int) = { basis.setDialogMessage    (p); basis }
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogMessage(java.lang.CharSequence) setDialogMessage(java.lang.CharSequence)]]`
   */@inline def dialogMessage  (p: java.lang.CharSequence) =            dialogMessage_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogMessage(java.lang.CharSequence) setDialogMessage(java.lang.CharSequence)]]`
   */@inline def dialogMessage_=(p: java.lang.CharSequence) = { basis.setDialogMessage    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#getDialogTitle() getDialogTitle()]]`
   */
  @inline def dialogTitle = basis.getDialogTitle
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogTitle(int) setDialogTitle(int)]]`
   */@inline def dialogTitle  (p: Int) =            dialogTitle_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogTitle(int) setDialogTitle(int)]]`
   */@inline def dialogTitle_=(p: Int) = { basis.setDialogTitle    (p); basis }
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogTitle(java.lang.CharSequence) setDialogTitle(java.lang.CharSequence)]]`
   */@inline def dialogTitle  (p: java.lang.CharSequence) =            dialogTitle_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setDialogTitle(java.lang.CharSequence) setDialogTitle(java.lang.CharSequence)]]`
   */@inline def dialogTitle_=(p: java.lang.CharSequence) = { basis.setDialogTitle    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#getNegativeButtonText() getNegativeButtonText()]]`
   */
  @inline def negativeButtonText = basis.getNegativeButtonText
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setNegativeButtonText(int) setNegativeButtonText(int)]]`
   */@inline def negativeButtonText  (p: Int) =            negativeButtonText_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setNegativeButtonText(int) setNegativeButtonText(int)]]`
   */@inline def negativeButtonText_=(p: Int) = { basis.setNegativeButtonText    (p); basis }
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setNegativeButtonText(java.lang.CharSequence) setNegativeButtonText(java.lang.CharSequence)]]`
   */@inline def negativeButtonText  (p: java.lang.CharSequence) =            negativeButtonText_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setNegativeButtonText(java.lang.CharSequence) setNegativeButtonText(java.lang.CharSequence)]]`
   */@inline def negativeButtonText_=(p: java.lang.CharSequence) = { basis.setNegativeButtonText    (p); basis }

  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#getPositiveButtonText() getPositiveButtonText()]]`
   */
  @inline def positiveButtonText = basis.getPositiveButtonText
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setPositiveButtonText(int) setPositiveButtonText(int)]]`
   */@inline def positiveButtonText  (p: Int) =            positiveButtonText_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setPositiveButtonText(int) setPositiveButtonText(int)]]`
   */@inline def positiveButtonText_=(p: Int) = { basis.setPositiveButtonText    (p); basis }
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setPositiveButtonText(java.lang.CharSequence) setPositiveButtonText(java.lang.CharSequence)]]`
   */@inline def positiveButtonText  (p: java.lang.CharSequence) =            positiveButtonText_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/DialogPreference.html#setPositiveButtonText(java.lang.CharSequence) setPositiveButtonText(java.lang.CharSequence)]]`
   */@inline def positiveButtonText_=(p: java.lang.CharSequence) = { basis.setPositiveButtonText    (p); basis }

}
/**
 * Automatically generated enriching class of `[[https://developer.android.com/reference/android/preference/EditTextPreference.html android.preference.EditTextPreference]]`.
 */
class RichEditTextPreference[V <: android.preference.EditTextPreference](val basis: V) extends TraitEditTextPreference[V]

/**
 * Automatically generated helper trait of `[[https://developer.android.com/reference/android/preference/EditTextPreference.html android.preference.EditTextPreference]]`. This contains several property accessors.
 */
trait TraitEditTextPreference[V <: android.preference.EditTextPreference] extends TraitDialogPreference[V] {




  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/EditTextPreference.html#getEditText() getEditText()]]`
   */
  @inline def editText = basis.getEditText


  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/EditTextPreference.html#getText() getText()]]`
   */
  @inline def text = basis.getText
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/EditTextPreference.html#setText(java.lang.String) setText(java.lang.String)]]`
   */@inline def text  (p: java.lang.String) =            text_=  (p)
  /**
   * Shortcut for `[[https://developer.android.com/reference/android/preference/EditTextPreference.html#setText(java.lang.String) setText(java.lang.String)]]`
   */@inline def text_=(p: java.lang.String) = { basis.setText    (p); basis }

}

/**
 * Automatically generated concrete helper class of `[[https://developer.android.com/reference/android/preference/EditTextPreference.html android.preference.EditTextPreference]]`.
 */
class SEditTextPreference()(implicit context: android.content.Context)
    extends android.preference.EditTextPreference(context) with TraitEditTextPreference[SEditTextPreference] {

  def basis = this

}

object SEditTextPreference {
  def apply()(implicit context: android.content.Context): SEditTextPreference = {
    val v = new SEditTextPreference
    v
  }

}


