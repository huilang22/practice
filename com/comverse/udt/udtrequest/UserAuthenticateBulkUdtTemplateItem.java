/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UserAuthenticateBulkUdtTemplateItem.java
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
 * Class used to create a UserAuthenticateBulkUdtTemplateItem Bulk Template
 *
 */

public class UserAuthenticateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UserObjData User;
  protected PasswordObjData Password;
/**
 *
 * Constructor to create a  UserAuthenticateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UserAuthenticateBulkUdtTemplateItem(String id, BSDMSessionContext context, UserObjData UserIn, PasswordObjData PasswordIn) {
    super(id, context, "UserAuthenticate");
    User = UserIn;
    Password = PasswordIn;
  }

  public void translateToMap() {
    if (User != null) {
      User.resetFlags(true, true);
      addInput("User", UserObjHelper.toMap(User, new HashMap(), "UserAuthenticateOutputData").get("UserAuthenticateOutputData"));
    }
    if (Password != null) {
      Password.resetFlags(true, true);
      addInput("Password", PasswordObjHelper.toMap(Password, new HashMap(), "UserAuthenticateOutputData").get("UserAuthenticateOutputData"));
    }
  }


/**
 *
 * Sets the User
 * @param UserIn Value of the User
 *
 */

  public void setUser(UserObjData UserIn) {
    User = UserIn;
  }

/**
 *
 * Sets the Password
 * @param PasswordIn Value of the Password
 *
 */

  public void setPassword(PasswordObjData PasswordIn) {
    Password = PasswordIn;
  }

  public void translateFromMap() {
    User = UserObjHelper.fromMap(inputMap, "User");
    Password = PasswordObjHelper.fromMap(inputMap, "Password");
  }

/**
 *
 * Gets the User
 * @return Value of the User
 *
 */

  public UserObjData getUser( ) {
    return User;
  }

/**
 *
 * Gets the Password
 * @return Value of the Password
 *
 */

  public PasswordObjData getPassword( ) {
    return Password;
  }

}
