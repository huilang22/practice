/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalRcUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ExternalRcUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExternalRcUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExternalRcObjectData noOpIn;

/**
 *
 * Constructor to create a   ExternalRcUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExternalRcUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalRcObjectData noOpInIn) {
    super(id, context, "ExternalRcUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(noOpIn, new HashMap(), "ExternalRc").get("ExternalRc"));
    }
  }
/**
 *
 * Sets the  ExternalRc
 * @param noOpInIn ExternalRcObjectData to set
 *
 */
  public void setExternalRc(ExternalRcObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExternalRc passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalRcObjectData getExternalRc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExternalRcObjectHelper.fromMap(inputMap, "ExternalRc");
  }
}
