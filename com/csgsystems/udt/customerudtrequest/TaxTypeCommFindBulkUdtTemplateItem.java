/*
 * Generated code DO NOT EDIT
 * Generated file: TaxTypeCommFindBulkUdtTemplateItem.java
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
 * Class used to create a TaxTypeCommFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxTypeCommFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TTCObjectFilter TTCFindIn;
/**
 *
 * Constructor to create a  TaxTypeCommFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxTypeCommFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TTCObjectFilter TTCFindInIn) {
    super(id, context, "TaxTypeCommFind");
    TTCFindIn = TTCFindInIn;
  }

  public void translateToMap() {
    if (TTCFindIn != null) {
      Integer index =  TTCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxTypeComm", TTCObjectHelper.toMap(TTCFindIn, new HashMap(), "TaxTypeComm").get("TaxTypeComm"));
    }
  }


/**
 *
 * Sets the TaxTypeComm
 * @param TTCFindInIn Value of the TTCFindIn
 *
 */

  public void setTaxTypeComm(TTCObjectFilter TTCFindInIn) {
    TTCFindIn = TTCFindInIn;
  }

  public void translateFromMap() {
    TTCFindIn = TTCObjectHelper.fromMapFilter(inputMap, "TaxTypeComm");
  }

/**
 *
 * Gets the TaxTypeComm
 * @return Value of the TaxTypeComm
 *
 */

  public TTCObjectFilter getTaxTypeComm( ) {
    return TTCFindIn;
  }

}
