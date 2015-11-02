/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusCreateBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusObjectData CSCreateIn;
/**
 *
 * Constructor to create a  CmfStatusCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusObjectData CSCreateInIn) {
    super(id, context, "CmfStatusCreate");
    CSCreateIn = CSCreateInIn;
  }

  public void translateToMap() {
    if (CSCreateIn != null) {
      CSCreateIn.resetFlags(true, true);
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(CSCreateIn, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }


/**
 *
 * Sets the CmfStatus
 * @param CSCreateInIn Value of the CSCreateIn
 *
 */

  public void setCmfStatus(CmfStatusObjectData CSCreateInIn) {
    CSCreateIn = CSCreateInIn;
  }

  public void translateFromMap() {
    CSCreateIn = CmfStatusObjectHelper.fromMap(inputMap, "CmfStatus");
  }

/**
 *
 * Gets the CmfStatus
 * @return Value of the CmfStatus
 *
 */

  public CmfStatusObjectData getCmfStatus( ) {
    return CSCreateIn;
  }

}
