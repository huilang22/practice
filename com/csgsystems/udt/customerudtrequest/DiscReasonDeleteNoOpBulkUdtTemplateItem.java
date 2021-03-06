/*
 * Generated code DO NOT EDIT
 * Generated file: DiscReasonDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscReasonDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscReasonDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DiscReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscReasonDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscReasonDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscReasonObjectData noOpInIn) {
    super(id, context, "DiscReasonDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DiscReason", DiscReasonObjectHelper.toMap(noOpIn, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }
/**
 *
 * Sets the  DiscReason
 * @param noOpInIn DiscReasonObjectData to set
 *
 */
  public void setDiscReason(DiscReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscReason passed into the constructor
 * @return Simulated response
 *
 */
  public DiscReasonObjectData getDiscReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DiscReasonObjectHelper.fromMap(inputMap, "DiscReason");
  }
}
