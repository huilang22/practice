/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectableGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a CollectableGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CollectableGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CollectableObjectData noOpIn;

/**
 *
 * Constructor to create a   CollectableGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CollectableGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CollectableObjectData noOpInIn) {
    super(id, context, "CollectableGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Collectable", CollectableObjectHelper.toMap(noOpIn, new HashMap(), "Collectable").get("Collectable"));
    }
  }
/**
 *
 * Sets the  Collectable
 * @param noOpInIn CollectableObjectData to set
 *
 */
  public void setCollectable(CollectableObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Collectable passed into the constructor
 * @return Simulated response
 *
 */
  public CollectableObjectData getCollectable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CollectableObjectHelper.fromMap(inputMap, "Collectable");
  }
}
