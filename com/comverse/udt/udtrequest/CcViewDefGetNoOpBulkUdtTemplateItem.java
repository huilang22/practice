/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewDefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CcViewDefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CcViewDefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CcViewDefObjectData noOpIn;

/**
 *
 * Constructor to create a   CcViewDefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CcViewDefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewDefObjectData noOpInIn) {
    super(id, context, "CcViewDefGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(noOpIn, new HashMap(), "CcViewDef").get("CcViewDef"));
    }
  }
/**
 *
 * Sets the  CcViewDef
 * @param noOpInIn CcViewDefObjectData to set
 *
 */
  public void setCcViewDef(CcViewDefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CcViewDef passed into the constructor
 * @return Simulated response
 *
 */
  public CcViewDefObjectData getCcViewDef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CcViewDefObjectHelper.fromMap(inputMap, "CcViewDef");
  }
}
