/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiNrcDucGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AbiNrcDucGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AbiNrcDucGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AbiNrcDucObjectData noOpIn;

/**
 *
 * Constructor to create a   AbiNrcDucGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AbiNrcDucGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiNrcDucObjectData noOpInIn) {
    super(id, context, "AbiNrcDucGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AbiNrcDuc", AbiNrcDucObjectHelper.toMap(noOpIn, new HashMap(), "AbiNrcDuc").get("AbiNrcDuc"));
    }
  }
/**
 *
 * Sets the  AbiNrcDuc
 * @param noOpInIn AbiNrcDucObjectData to set
 *
 */
  public void setAbiNrcDuc(AbiNrcDucObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AbiNrcDuc passed into the constructor
 * @return Simulated response
 *
 */
  public AbiNrcDucObjectData getAbiNrcDuc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AbiNrcDucObjectHelper.fromMap(inputMap, "AbiNrcDuc");
  }
}
