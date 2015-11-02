/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusObjectKeyData CSDeleteIn;
/**
 *
 * Constructor to create a  CmfStatusDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusObjectKeyData CSDeleteInIn) {
    super(id, context, "CmfStatusDelete");
    CSDeleteIn = CSDeleteInIn;
  }

  public void translateToMap() {
    if (CSDeleteIn != null) {
      CSDeleteIn.resetFlags(true, true);
      addInput("CmfStatus", CmfStatusObjectKeyHelper.toMap(CSDeleteIn, new HashMap(), "CmfStatusObjectKeyData").get("CmfStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the CmfStatus
 * @param CSDeleteInIn Value of the CSDeleteIn
 *
 */

  public void setCmfStatus(CmfStatusObjectKeyData CSDeleteInIn) {
    CSDeleteIn = CSDeleteInIn;
  }

  public void translateFromMap() {
    CSDeleteIn = CmfStatusObjectKeyHelper.fromMap(inputMap, "CmfStatus");
  }

/**
 *
 * Gets the CmfStatus
 * @return Value of the CmfStatus
 *
 */

  public CmfStatusObjectKeyData getCmfStatus( ) {
    return CSDeleteIn;
  }

}
