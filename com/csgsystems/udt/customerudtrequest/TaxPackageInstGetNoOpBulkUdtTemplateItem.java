/*
 * Generated code DO NOT EDIT
 * Generated file: TaxPackageInstGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxPackageInstGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxPackageInstGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TPIObjectData noOpIn;

/**
 *
 * Constructor to create a   TaxPackageInstGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxPackageInstGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TPIObjectData noOpInIn) {
    super(id, context, "TaxPackageInstGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("TaxPackageInst", TPIObjectHelper.toMap(noOpIn, new HashMap(), "TaxPackageInst").get("TaxPackageInst"));
    }
  }
/**
 *
 * Sets the  TaxPackageInst
 * @param noOpInIn TPIObjectData to set
 *
 */
  public void setTaxPackageInst(TPIObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxPackageInst passed into the constructor
 * @return Simulated response
 *
 */
  public TPIObjectData getTaxPackageInst() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TPIObjectHelper.fromMap(inputMap, "TaxPackageInst");
  }
}
