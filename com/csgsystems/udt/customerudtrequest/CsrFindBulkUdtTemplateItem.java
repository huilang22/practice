/*
 * Generated code DO NOT EDIT
 * Generated file: CsrFindBulkUdtTemplateItem.java
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
 * Class used to create a CsrFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrObjectFilter CSRfindIn;
/**
 *
 * Constructor to create a  CsrFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrObjectFilter CSRfindInIn) {
    super(id, context, "CsrFind");
    CSRfindIn = CSRfindInIn;
  }

  public void translateToMap() {
    if (CSRfindIn != null) {
      Integer index =  CSRfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Csr", CsrObjectHelper.toMap(CSRfindIn, new HashMap(), "Csr").get("Csr"));
    }
  }


/**
 *
 * Sets the Csr
 * @param CSRfindInIn Value of the CSRfindIn
 *
 */

  public void setCsr(CsrObjectFilter CSRfindInIn) {
    CSRfindIn = CSRfindInIn;
  }

  public void translateFromMap() {
    CSRfindIn = CsrObjectHelper.fromMapFilter(inputMap, "Csr");
  }

/**
 *
 * Gets the Csr
 * @return Value of the Csr
 *
 */

  public CsrObjectFilter getCsr( ) {
    return CSRfindIn;
  }

}
