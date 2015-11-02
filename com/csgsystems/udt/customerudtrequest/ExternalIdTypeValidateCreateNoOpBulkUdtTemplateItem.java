/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdTypeValidateCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ExternalIdTypeValidateCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExternalIdTypeValidateCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExternalIdTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   ExternalIdTypeValidateCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExternalIdTypeValidateCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalIdTypeObjectData noOpInIn) {
    super(id, context, "ExternalIdTypeValidateCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExternalIdTypeValidate", ExternalIdTypeObjectHelper.toMap(noOpIn, new HashMap(), "ExternalIdTypeValidate").get("ExternalIdTypeValidate"));
    }
  }
/**
 *
 * Sets the  ExternalIdTypeValidate
 * @param noOpInIn ExternalIdTypeObjectData to set
 *
 */
  public void setExternalIdTypeValidate(ExternalIdTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExternalIdTypeValidate passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalIdTypeObjectData getExternalIdTypeValidate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExternalIdTypeObjectHelper.fromMap(inputMap, "ExternalIdTypeValidate");
  }
}
