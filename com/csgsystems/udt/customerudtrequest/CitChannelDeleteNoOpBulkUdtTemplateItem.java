/*
 * Generated code DO NOT EDIT
 * Generated file: CitChannelDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitChannelDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitChannelDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitChannelObjectData noOpIn;

/**
 *
 * Constructor to create a   CitChannelDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitChannelDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitChannelObjectData noOpInIn) {
    super(id, context, "CitChannelDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitChannel", CitChannelObjectHelper.toMap(noOpIn, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }
/**
 *
 * Sets the  CitChannel
 * @param noOpInIn CitChannelObjectData to set
 *
 */
  public void setCitChannel(CitChannelObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitChannel passed into the constructor
 * @return Simulated response
 *
 */
  public CitChannelObjectData getCitChannel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitChannelObjectHelper.fromMap(inputMap, "CitChannel");
  }
}
