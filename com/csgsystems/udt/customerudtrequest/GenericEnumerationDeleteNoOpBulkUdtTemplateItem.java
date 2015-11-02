/*
 * Generated code DO NOT EDIT
 * Generated file: GenericEnumerationDeleteNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a GenericEnumerationDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GenericEnumerationDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GEObjectData noOpIn;

/**
 *
 * Constructor to create a   GenericEnumerationDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GenericEnumerationDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GEObjectData noOpInIn) {
    super(id, context, "GenericEnumerationDelete");
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
