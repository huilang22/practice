/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelSequenceGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitChannelSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitChannelSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitChannelObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   CitChannelSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitChannelSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitChannelObjectKeyData noOpInIn) {
    super(id, context, "CitChannelSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitChannel", CitChannelObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }
/**
 *
 * Sets the  CitChannel
 * @param noOpInIn CitChannelObjectKeyData to set
 *
 */
  public void setCitChannel(CitChannelObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitChannel passed into the constructor
 * @return Simulated response
 *
 */
  public CitChannelObjectKeyData getCitChannel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitChannelObjectKeyHelper.fromMap(inputMap, "CitChannel");
  }
}
