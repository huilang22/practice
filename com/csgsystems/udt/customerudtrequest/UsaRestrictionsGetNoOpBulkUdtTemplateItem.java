/*
 * Generated code DO NOT EDIT
 * Generated file: UsaRestrictionsGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UsaRestrictionsGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsaRestrictionsGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsaRestrictionsObjectData noOpIn;

/**
 *
 * Constructor to create a   UsaRestrictionsGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsaRestrictionsGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsaRestrictionsObjectData noOpInIn) {
    super(id, context, "UsaRestrictionsGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(noOpIn, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }
/**
 *
 * Sets the  UsaRestrictions
 * @param noOpInIn UsaRestrictionsObjectData to set
 *
 */
  public void setUsaRestrictions(UsaRestrictionsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsaRestrictions passed into the constructor
 * @return Simulated response
 *
 */
  public UsaRestrictionsObjectData getUsaRestrictions() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsaRestrictionsObjectHelper.fromMap(inputMap, "UsaRestrictions");
  }
}
