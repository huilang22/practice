/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewAttributesGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CcViewAttributesGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CcViewAttributesGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CcViewAttributesObjectData noOpIn;

/**
 *
 * Constructor to create a   CcViewAttributesGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CcViewAttributesGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewAttributesObjectData noOpInIn) {
    super(id, context, "CcViewAttributesGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(noOpIn, new HashMap(), "CcViewAttributes").get("CcViewAttributes"));
    }
  }
/**
 *
 * Sets the  CcViewAttributes
 * @param noOpInIn CcViewAttributesObjectData to set
 *
 */
  public void setCcViewAttributes(CcViewAttributesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CcViewAttributes passed into the constructor
 * @return Simulated response
 *
 */
  public CcViewAttributesObjectData getCcViewAttributes() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CcViewAttributesObjectHelper.fromMap(inputMap, "CcViewAttributes");
  }
}
