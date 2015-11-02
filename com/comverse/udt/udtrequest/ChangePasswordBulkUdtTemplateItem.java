/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChangePasswordBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.sec.data.*;

/**
 *
 * Class used to create a ChangePasswordBulkUdtTemplateItem Bulk Template
 *
 */

public class ChangePasswordBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UserObjData ChangeUser;
  protected PasswordObjData OldPassword;
  protected PasswordObjData NewPassword;
/**
 *
 * Constructor to create a  ChangePasswordBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ChangePasswordBulkUdtTemplateItem(String id, BSDMSessionContext context, UserObjData ChangeUserIn, PasswordObjData OldPasswordIn, PasswordObjData NewPasswordIn) {
    super(id, context, "ChangePassword");
    ChangeUser = ChangeUserIn;
    OldPassword = OldPasswordIn;
    NewPassword = NewPasswordIn;
  }

  public void translateToMap() {
    if (ChangeUser != null) {
      ChangeUser.resetFlags(true, true);
      addInput("ChangeUser", UserObjHelper.toMap(ChangeUser, new HashMap(), "PasswordChanged").get("PasswordChanged"));
    }
    if (OldPassword != null) {
      OldPassword.resetFlags(true, true);
      addInput("OldPassword", PasswordObjHelper.toMap(OldPassword, new HashMap(), "PasswordChanged").get("PasswordChanged"));
    }
    if (NewPassword != null) {
      NewPassword.resetFlags(true, true);
      addInput("NewPassword", PasswordObjHelper.toMap(NewPassword, new HashMap(), "PasswordChanged").get("PasswordChanged"));
    }
  }


/**
 *
 * Sets the ChangeUser
 * @param ChangeUserIn Value of the ChangeUser
 *
 */

  public void setChangeUser(UserObjData ChangeUserIn) {
    ChangeUser = ChangeUserIn;
  }

/**
 *
 * Sets the OldPassword
 * @param OldPasswordIn Value of the OldPassword
 *
 */

  public void setOldPassword(PasswordObjData OldPasswordIn) {
    OldPassword = OldPasswordIn;
  }

/**
 *
 * Sets the NewPassword
 * @param NewPasswordIn Value of the NewPassword
 *
 */

  public void setNewPassword(PasswordObjData NewPasswordIn) {
    NewPassword = NewPasswordIn;
  }

  public void translateFromMap() {
    ChangeUser = UserObjHelper.fromMap(inputMap, "ChangeUser");
    OldPassword = PasswordObjHelper.fromMap(inputMap, "OldPassword");
    NewPassword = PasswordObjHelper.fromMap(inputMap, "NewPassword");
  }

/**
 *
 * Gets the ChangeUser
 * @return Value of the ChangeUser
 *
 */

  public UserObjData getChangeUser( ) {
    return ChangeUser;
  }

/**
 *
 * Gets the OldPassword
 * @return Value of the OldPassword
 *
 */

  public PasswordObjData getOldPassword( ) {
    return OldPassword;
  }

/**
 *
 * Gets the NewPassword
 * @return Value of the NewPassword
 *
 */

  public PasswordObjData getNewPassword( ) {
    return NewPassword;
  }

}
