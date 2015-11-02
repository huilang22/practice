/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeEquipTxnAssocFindcommontxnBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsTypeEquipTxnAssocFindcommontxnBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeEquipTxnAssocFindcommontxnBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ITETAInventoryTypeObjectData[] ITETAFindCommonIn;
/**
 *
 * Constructor to create a  InvsTypeEquipTxnAssocFindcommontxnBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeEquipTxnAssocFindcommontxnBulkUdtTemplateItem(String id, BSDMSessionContext context, ITETAInventoryTypeObjectData[] ITETAFindCommonInIn) {
    super(id, context, "InvsTypeEquipTxnAssocFindcommontxn");
    ITETAFindCommonIn = ITETAFindCommonInIn;
  }

  public void translateToMap() {
    if (ITETAFindCommonIn != null) {
      if (ITETAFindCommonIn != null) {
        Object[] list = new Object[ITETAFindCommonIn.length];
        for (int i = 0; i < ITETAFindCommonIn.length; i++) {
          list[i] = ITETAInventoryTypeObjectHelper.getMap(ITETAFindCommonIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvsTypeEquipTxnAssoc");
        }
        addInput("InvsTypeEquipTxnAssocList", list);
      }
    }
  }


/**
 *
 * Sets the InvsTypeEquipTxnAssoc
 * @param ITETAFindCommonInIn Value of the ITETAFindCommonIn
 *
 */

  public void setInvsTypeEquipTxnAssoc(ITETAInventoryTypeObjectData[] ITETAFindCommonInIn) {
    ITETAFindCommonIn = ITETAFindCommonInIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("InvsTypeEquipTxnAssocList");
    if (list != null) {
      ITETAFindCommonIn = new ITETAInventoryTypeObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ITETAFindCommonIn[i] = ITETAInventoryTypeObjectHelper.getObj((Map) list[i]);
        ITETAFindCommonIn[i].resetFlags(true, true);
      }
    }
  }

/**
 *
 * Gets the InvsTypeEquipTxnAssoc
 * @return Value of the InvsTypeEquipTxnAssoc
 *
 */

  public ITETAInventoryTypeObjectData[] getInvsTypeEquipTxnAssoc( ) {
    return ITETAFindCommonIn;
  }

}
