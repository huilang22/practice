/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityAciCreateInternalBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a SecurityAciCreateInternalBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityAciCreateInternalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityAciObjectData AciCreateIn;
  protected String user_name;
/**
 *
 * Constructor to create a  SecurityAciCreateInternalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityAciCreateInternalBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityAciObjectData AciCreateInIn, String user_nameIn) {
    super(id, context, "SecurityAciCreateInternal");
    AciCreateIn = AciCreateInIn;
    user_name = user_nameIn;
  }

  public void translateToMap() {
    if (AciCreateIn != null) {
      AciCreateIn.resetFlags(true, true);
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(AciCreateIn, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
    if (user_name != null) {
      addInput("UserName", user_name);
    }
  }


/**
 *
 * Sets the SecurityAci
 * @param AciCreateInIn Value of the AciCreateIn
 *
 */

  public void setSecurityAci(SecurityAciObjectData AciCreateInIn) {
    AciCreateIn = AciCreateInIn;
  }

/**
 *
 * Sets the UserName
 * @param user_nameIn Value of the user_name
 *
 */

  public void setUserName(String user_nameIn) {
    user_name = user_nameIn;
  }

  public void translateFromMap() {
    AciCreateIn = SecurityAciObjectHelper.fromMap(inputMap, "SecurityAci");
    user_name = (String)inputMap.get("UserName");
  }

/**
 *
 * Gets the SecurityAci
 * @return Value of the SecurityAci
 *
 */

  public SecurityAciObjectData getSecurityAci( ) {
    return AciCreateIn;
  }

/**
 *
 * Gets the UserName
 * @return Value of the UserName
 *
 */

  public String getUserName( ) {
    return user_name;
  }

}
