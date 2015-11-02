/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusObjectKeyData CSGetIn;
/**
 *
 * Constructor to create a  CmfStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusObjectKeyData CSGetInIn) {
    super(id, context, "CmfStatusGet");
    CSGetIn = CSGetInIn;
  }

  public void translateToMap() {
    if (CSGetIn != null) {
      CSGetIn.resetFlags(true, true);
      addInput("CmfStatus", CmfStatusObjectKeyHelper.toMap(CSGetIn, new HashMap(), "CmfStatusObjectKeyData").get("CmfStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the CmfStatus
 * @param CSGetInIn Value of the CSGetIn
 *
 */

  public void setCmfStatus(CmfStatusObjectKeyData CSGetInIn) {
    CSGetIn = CSGetInIn;
  }

  public void translateFromMap() {
    CSGetIn = CmfStatusObjectKeyHelper.fromMap(inputMap, "CmfStatus");
  }

/**
 *
 * Gets the CmfStatus
 * @return Value of the CmfStatus
 *
 */

  public CmfStatusObjectKeyData getCmfStatus( ) {
    return CSGetIn;
  }

}
