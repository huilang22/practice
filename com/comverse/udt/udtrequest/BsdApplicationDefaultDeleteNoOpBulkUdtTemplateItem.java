/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationDefaultDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationDefaultDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationDefaultObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationDefaultDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationDefaultDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationDefaultObjectData noOpInIn) {
    super(id, context, "BsdApplicationDefaultDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationDefault").get("BsdApplicationDefault"));
    }
  }
/**
 *
 * Sets the  BsdApplicationDefault
 * @param noOpInIn BsdApplicationDefaultObjectData to set
 *
 */
  public void setBsdApplicationDefault(BsdApplicationDefaultObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationDefaultObjectData getBsdApplicationDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationDefaultObjectHelper.fromMap(inputMap, "BsdApplicationDefault");
  }
}
