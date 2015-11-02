/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeDefaultGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdApplicationAttributeDefaultGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationAttributeDefaultGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationAttributeDefaultObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationAttributeDefaultGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationAttributeDefaultGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationAttributeDefaultObjectData noOpInIn) {
    super(id, context, "BsdApplicationAttributeDefaultGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdApplicationAttributeDefault", BsdApplicationAttributeDefaultObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationAttributeDefault").get("BsdApplicationAttributeDefault"));
    }
  }
/**
 *
 * Sets the  BsdApplicationAttributeDefault
 * @param noOpInIn BsdApplicationAttributeDefaultObjectData to set
 *
 */
  public void setBsdApplicationAttributeDefault(BsdApplicationAttributeDefaultObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationAttributeDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationAttributeDefaultObjectData getBsdApplicationAttributeDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationAttributeDefaultObjectHelper.fromMap(inputMap, "BsdApplicationAttributeDefault");
  }
}
