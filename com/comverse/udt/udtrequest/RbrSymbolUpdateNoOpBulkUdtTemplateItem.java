/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrSymbolUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrSymbolUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrSymbolObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrSymbolUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrSymbolUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrSymbolObjectData noOpInIn) {
    super(id, context, "RbrSymbolUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(noOpIn, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }
/**
 *
 * Sets the  RbrSymbol
 * @param noOpInIn RbrSymbolObjectData to set
 *
 */
  public void setRbrSymbol(RbrSymbolObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrSymbol passed into the constructor
 * @return Simulated response
 *
 */
  public RbrSymbolObjectData getRbrSymbol() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrSymbolObjectHelper.fromMap(inputMap, "RbrSymbol");
  }
}
