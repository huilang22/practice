/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a MIHSubscriberGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MIHSubscriberGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MIHSubscriberGetOutputData noOpIn;

/**
 *
 * Constructor to create a   MIHSubscriberGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MIHSubscriberGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MIHSubscriberGetOutputData noOpInIn) {
    super(id, context, "MIHSubscriberGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("MIHSubscriberGetOutputData", MIHSubscriberGetOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  MIHSubscriberGetOutputData
 * @param noOpInIn MIHSubscriberGetOutputData to set
 *
 */
  public void setMIHSubscriberGetOutputData(MIHSubscriberGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MIHSubscriberGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public MIHSubscriberGetOutputData getMIHSubscriberGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MIHSubscriberGetOutputHelper.fromMap(inputMap);
  }
}
