/*
 * Generated code DO NOT EDIT
 * Generated file: TaxPackageInstGetBulkUdtTemplateItem.java
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
 * Class used to create a TaxPackageInstGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxPackageInstGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TPIObjectKeyData TPIGetIn;
/**
 *
 * Constructor to create a  TaxPackageInstGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxPackageInstGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TPIObjectKeyData TPIGetInIn) {
    super(id, context, "TaxPackageInstGet");
    TPIGetIn = TPIGetInIn;
  }

  public void translateToMap() {
    if (TPIGetIn != null) {
      TPIGetIn.resetFlags(true, true);
      addInput("TaxPackageInst", TPIObjectKeyHelper.toMap(TPIGetIn, new HashMap(), "TPIObjectKeyData").get("TPIObjectKeyData"));
    }
  }


/**
 *
 * Sets the TaxPackageInst
 * @param TPIGetInIn Value of the TPIGetIn
 *
 */

  public void setTaxPackageInst(TPIObjectKeyData TPIGetInIn) {
    TPIGetIn = TPIGetInIn;
  }

  public void translateFromMap() {
    TPIGetIn = TPIObjectKeyHelper.fromMap(inputMap, "TaxPackageInst");
  }

/**
 *
 * Gets the TaxPackageInst
 * @return Value of the TaxPackageInst
 *
 */

  public TPIObjectKeyData getTaxPackageInst( ) {
    return TPIGetIn;
  }

}
