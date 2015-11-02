/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationObjectData noOpInIn) {
    super(id, context, "BsdApplicationGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }
/**
 *
 * Sets the  BsdApplication
 * @param noOpInIn BsdApplicationObjectData to set
 *
 */
  public void setBsdApplication(BsdApplicationObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplication passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationObjectData getBsdApplication() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationObjectHelper.fromMap(inputMap, "BsdApplication");
  }
}
