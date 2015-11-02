/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDtUrlGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a CustomerDtUrlGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerDtUrlGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerDtUrlObjectData noOpIn;

/**
 *
 * Constructor to create a   CustomerDtUrlGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerDtUrlGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDtUrlObjectData noOpInIn) {
    super(id, context, "CustomerDtUrlGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CustomerDtUrl", CustomerDtUrlObjectHelper.toMap(noOpIn, new HashMap(), "CustomerDtUrl").get("CustomerDtUrl"));
    }
  }
/**
 *
 * Sets the  CustomerDtUrl
 * @param noOpInIn CustomerDtUrlObjectData to set
 *
 */
  public void setCustomerDtUrl(CustomerDtUrlObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerDtUrl passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerDtUrlObjectData getCustomerDtUrl() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerDtUrlObjectHelper.fromMap(inputMap, "CustomerDtUrl");
  }
}
