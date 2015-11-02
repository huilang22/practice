/*
 * Generated code DO NOT EDIT
 * Generated file: TaxPackageInstFindBulkUdtTemplateItem.java
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
 * Class used to create a TaxPackageInstFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxPackageInstFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TPIObjectFilter TPIFindIn;
/**
 *
 * Constructor to create a  TaxPackageInstFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxPackageInstFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TPIObjectFilter TPIFindInIn) {
    super(id, context, "TaxPackageInstFind");
    TPIFindIn = TPIFindInIn;
  }

  public void translateToMap() {
    if (TPIFindIn != null) {
      Integer index =  TPIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxPackageInst", TPIObjectHelper.toMap(TPIFindIn, new HashMap(), "TaxPackageInst").get("TaxPackageInst"));
    }
  }


/**
 *
 * Sets the TaxPackageInst
 * @param TPIFindInIn Value of the TPIFindIn
 *
 */

  public void setTaxPackageInst(TPIObjectFilter TPIFindInIn) {
    TPIFindIn = TPIFindInIn;
  }

  public void translateFromMap() {
    TPIFindIn = TPIObjectHelper.fromMapFilter(inputMap, "TaxPackageInst");
  }

/**
 *
 * Gets the TaxPackageInst
 * @return Value of the TaxPackageInst
 *
 */

  public TPIObjectFilter getTaxPackageInst( ) {
    return TPIFindIn;
  }

}
