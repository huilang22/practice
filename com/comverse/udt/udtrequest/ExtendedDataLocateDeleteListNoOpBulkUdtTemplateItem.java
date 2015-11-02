/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataLocateDeleteListNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ExtendedDataLocateDeleteListNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataLocateDeleteListNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExtendedDataLocateObjectData noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataLocateDeleteListNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataLocateDeleteListNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataLocateObjectData noOpInIn) {
    super(id, context, "ExtendedDataLocateDeleteList");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(noOpIn, new HashMap(), "ExtendedDataLocate").get("ExtendedDataLocate"));
    }
  }
/**
 *
 * Sets the  ExtendedDataLocate
 * @param noOpInIn ExtendedDataLocateObjectData to set
 *
 */
  public void setExtendedDataLocate(ExtendedDataLocateObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataLocate passed into the constructor
 * @return Simulated response
 *
 */
  public ExtendedDataLocateObjectData getExtendedDataLocate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExtendedDataLocateObjectHelper.fromMap(inputMap, "ExtendedDataLocate");
  }
}
