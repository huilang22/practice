/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdViewsCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdViewsCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdViewsObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdViewsCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdViewsCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdViewsObjectData noOpInIn) {
    super(id, context, "InvdViewsCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvdViews", InvdViewsObjectHelper.toMap(noOpIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }
/**
 *
 * Sets the  InvdViews
 * @param noOpInIn InvdViewsObjectData to set
 *
 */
  public void setInvdViews(InvdViewsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdViews passed into the constructor
 * @return Simulated response
 *
 */
  public InvdViewsObjectData getInvdViews() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdViewsObjectHelper.fromMap(inputMap, "InvdViews");
  }
}
