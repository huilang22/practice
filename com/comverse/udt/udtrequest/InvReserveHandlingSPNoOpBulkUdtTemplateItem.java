/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvReserveHandlingSPNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvReserveHandlingSPNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvReserveHandlingSPNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   InvReserveHandlingSPNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvReserveHandlingSPNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "InvReserveHandlingSP");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("VCount", noOpIn);
    }
  }
/**
 *
 * Sets the  VCount
 * @param noOpInIn Integer to set
 *
 */
  public void setVCount(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VCount passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getVCount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("VCount");
  }
}
