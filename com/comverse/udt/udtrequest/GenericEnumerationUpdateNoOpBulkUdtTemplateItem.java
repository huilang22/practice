/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GenericEnumerationUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GenericEnumerationUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GEObjectData noOpIn;

/**
 *
 * Constructor to create a   GenericEnumerationUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GenericEnumerationUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GEObjectData noOpInIn) {
    super(id, context, "GenericEnumerationUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GenericEnumeration", GEObjectHelper.toMap(noOpIn, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }
/**
 *
 * Sets the  GenericEnumeration
 * @param noOpInIn GEObjectData to set
 *
 */
  public void setGenericEnumeration(GEObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GenericEnumeration passed into the constructor
 * @return Simulated response
 *
 */
  public GEObjectData getGenericEnumeration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GEObjectHelper.fromMap(inputMap, "GenericEnumeration");
  }
}
