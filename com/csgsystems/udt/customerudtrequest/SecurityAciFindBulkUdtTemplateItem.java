/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityAciFindBulkUdtTemplateItem.java
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
 * Class used to create a SecurityAciFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityAciFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityAciObjectFilter SecurityAciFindIn;
/**
 *
 * Constructor to create a  SecurityAciFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityAciFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityAciObjectFilter SecurityAciFindInIn) {
    super(id, context, "SecurityAciFind");
    SecurityAciFindIn = SecurityAciFindInIn;
  }

  public void translateToMap() {
    if (SecurityAciFindIn != null) {
      Integer index =  SecurityAciFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(SecurityAciFindIn, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
  }


/**
 *
 * Sets the SecurityAci
 * @param SecurityAciFindInIn Value of the SecurityAciFindIn
 *
 */

  public void setSecurityAci(SecurityAciObjectFilter SecurityAciFindInIn) {
    SecurityAciFindIn = SecurityAciFindInIn;
  }

  public void translateFromMap() {
    SecurityAciFindIn = SecurityAciObjectHelper.fromMapFilter(inputMap, "SecurityAci");
  }

/**
 *
 * Gets the SecurityAci
 * @return Value of the SecurityAci
 *
 */

  public SecurityAciObjectFilter getSecurityAci( ) {
    return SecurityAciFindIn;
  }

}
