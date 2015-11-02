/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityUserGetBulkUdtTemplateItem.java
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
 * Class used to create a SecurityUserGetBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityUserGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityUserObjectKeyData SecurityUserGetIn;
/**
 *
 * Constructor to create a  SecurityUserGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityUserGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityUserObjectKeyData SecurityUserGetInIn) {
    super(id, context, "SecurityUserGet");
    SecurityUserGetIn = SecurityUserGetInIn;
  }

  public void translateToMap() {
    if (SecurityUserGetIn != null) {
      SecurityUserGetIn.resetFlags(true, true);
      addInput("SecurityUser", SecurityUserObjectKeyHelper.toMap(SecurityUserGetIn, new HashMap(), "SecurityUserObjectKeyData").get("SecurityUserObjectKeyData"));
    }
  }


/**
 *
 * Sets the SecurityUser
 * @param SecurityUserGetInIn Value of the SecurityUserGetIn
 *
 */

  public void setSecurityUser(SecurityUserObjectKeyData SecurityUserGetInIn) {
    SecurityUserGetIn = SecurityUserGetInIn;
  }

  public void translateFromMap() {
    SecurityUserGetIn = SecurityUserObjectKeyHelper.fromMap(inputMap, "SecurityUser");
  }

/**
 *
 * Gets the SecurityUser
 * @return Value of the SecurityUser
 *
 */

  public SecurityUserObjectKeyData getSecurityUser( ) {
    return SecurityUserGetIn;
  }

}
