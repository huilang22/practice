/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeByGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentTypeByGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentTypeByGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer LanguageCode;
  protected Integer adj_trans_group;
/**
 *
 * Constructor to create a  AdjustmentTypeByGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentTypeByGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer LanguageCodeIn, Integer adj_trans_groupIn) {
    super(id, context, "AdjustmentTypeByGroupFind");
    LanguageCode = LanguageCodeIn;
    adj_trans_group = adj_trans_groupIn;
  }

  public void translateToMap() {
    if (LanguageCode != null) {
      addInput("LanguageCode", LanguageCode);
    }
    if (adj_trans_group != null) {
      addInput("AdjTransGroup", adj_trans_group);
    }
  }


/**
 *
 * Sets the LanguageCode
 * @param LanguageCodeIn Value of the LanguageCode
 *
 */

  public void setLanguageCode(Integer LanguageCodeIn) {
    LanguageCode = LanguageCodeIn;
  }

/**
 *
 * Sets the AdjTransGroup
 * @param adj_trans_groupIn Value of the adj_trans_group
 *
 */

  public void setAdjTransGroup(Integer adj_trans_groupIn) {
    adj_trans_group = adj_trans_groupIn;
  }

  public void translateFromMap() {
    LanguageCode = (Integer)inputMap.get("LanguageCode");
    adj_trans_group = (Integer)inputMap.get("AdjTransGroup");
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return LanguageCode;
  }

/**
 *
 * Gets the AdjTransGroup
 * @return Value of the AdjTransGroup
 *
 */

  public Integer getAdjTransGroup( ) {
    return adj_trans_group;
  }

}
