/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SpecialDestinationTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SpecialDestinationTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SpecialDestinationTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   SpecialDestinationTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SpecialDestinationTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SpecialDestinationTypeObjectData noOpInIn) {
    super(id, context, "SpecialDestinationTypeCreate");
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
