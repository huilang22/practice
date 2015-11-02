/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SpecialDestinationTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SpecialDestinationTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SpecialDestinationTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   SpecialDestinationTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SpecialDestinationTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SpecialDestinationTypeObjectData noOpInIn) {
    super(id, context, "SpecialDestinationTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(noOpIn, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }
/**
 *
 * Sets the  SpecialDestinationType
 * @param noOpInIn SpecialDestinationTypeObjectData to set
 *
 */
  public void setSpecialDestinationType(SpecialDestinationTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SpecialDestinationType passed into the constructor
 * @return Simulated response
 *
 */
  public SpecialDestinationTypeObjectData getSpecialDestinationType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SpecialDestinationTypeObjectHelper.fromMap(inputMap, "SpecialDestinationType");
  }
}
