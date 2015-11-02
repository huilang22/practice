/*
 * Generated code DO NOT EDIT
 * Generated file: HqgroupUsageRedirectMapDeleteBulkUdtTemplateItem.java
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
 * Class used to create a HqgroupUsageRedirectMapDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class HqgroupUsageRedirectMapDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectMapObjectKeyData HGURMDeleteIn;
  protected Date HGURMDCeaseDate;
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqgroupUsageRedirectMapDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectKeyData HGURMDeleteInIn, Date HGURMDCeaseDateIn) {
    super(id, context, "HqgroupUsageRedirectMapDelete");
    HGURMDeleteIn = HGURMDeleteInIn;
    HGURMDCeaseDate = HGURMDCeaseDateIn;
  }

  public void translateToMap() {
    if (HGURMDeleteIn != null) {
      HGURMDeleteIn.resetFlags(true, true);
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectKeyHelper.toMap(HGURMDeleteIn, new HashMap(), "HqGroupUsageRedirectMapObjectKeyData").get("HqGroupUsageRedirectMapObjectKeyData"));
    }
    if (HGURMDCeaseDate != null) {
      addInput("HGURMDCeaseDate", HGURMDCeaseDate);
    }
  }


/**
 *
 * Sets the HqgroupUsageRedirectMap
 * @param HGURMDeleteInIn Value of the HGURMDeleteIn
 *
 */

  public void setHqgroupUsageRedirectMap(HqGroupUsageRedirectMapObjectKeyData HGURMDeleteInIn) {
    HGURMDeleteIn = HGURMDeleteInIn;
  }

/**
 *
 * Sets the HGURMDCeaseDate
 * @param HGURMDCeaseDateIn Value of the HGURMDCeaseDate
 *
 */

  public void setHGURMDCeaseDate(Date HGURMDCeaseDateIn) {
    HGURMDCeaseDate = HGURMDCeaseDateIn;
  }

  public void translateFromMap() {
    HGURMDeleteIn = HqGroupUsageRedirectMapObjectKeyHelper.fromMap(inputMap, "HqgroupUsageRedirectMap");
    HGURMDCeaseDate = (Date)inputMap.get("HGURMDCeaseDate");
  }

/**
 *
 * Gets the HqgroupUsageRedirectMap
 * @return Value of the HqgroupUsageRedirectMap
 *
 */

  public HqGroupUsageRedirectMapObjectKeyData getHqgroupUsageRedirectMap( ) {
    return HGURMDeleteIn;
  }

/**
 *
 * Gets the HGURMDCeaseDate
 * @return Value of the HGURMDCeaseDate
 *
 */

  public Date getHGURMDCeaseDate( ) {
    return HGURMDCeaseDate;
  }

}
