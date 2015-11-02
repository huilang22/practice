/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusObjectFilter CSFindIn;
/**
 *
 * Constructor to create a  CmfStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusObjectFilter CSFindInIn) {
    super(id, context, "CmfStatusFind");
    CSFindIn = CSFindInIn;
  }

  public void translateToMap() {
    if (CSFindIn != null) {
      Integer index =  CSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(CSFindIn, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }


/**
 *
 * Sets the CmfStatus
 * @param CSFindInIn Value of the CSFindIn
 *
 */

  public void setCmfStatus(CmfStatusObjectFilter CSFindInIn) {
    CSFindIn = CSFindInIn;
  }

  public void translateFromMap() {
    CSFindIn = CmfStatusObjectHelper.fromMapFilter(inputMap, "CmfStatus");
  }

/**
 *
 * Gets the CmfStatus
 * @return Value of the CmfStatus
 *
 */

  public CmfStatusObjectFilter getCmfStatus( ) {
    return CSFindIn;
  }

}
