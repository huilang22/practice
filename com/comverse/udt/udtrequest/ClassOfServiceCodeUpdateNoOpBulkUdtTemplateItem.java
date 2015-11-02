/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ClassOfServiceCodeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ClassOfServiceCodeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected COSCObjectData noOpIn;

/**
 *
 * Constructor to create a   ClassOfServiceCodeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ClassOfServiceCodeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, COSCObjectData noOpInIn) {
    super(id, context, "ClassOfServiceCodeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(noOpIn, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }
/**
 *
 * Sets the  ClassOfServiceCode
 * @param noOpInIn COSCObjectData to set
 *
 */
  public void setClassOfServiceCode(COSCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ClassOfServiceCode passed into the constructor
 * @return Simulated response
 *
 */
  public COSCObjectData getClassOfServiceCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = COSCObjectHelper.fromMap(inputMap, "ClassOfServiceCode");
  }
}
