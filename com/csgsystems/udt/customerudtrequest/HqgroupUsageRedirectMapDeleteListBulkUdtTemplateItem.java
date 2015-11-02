/*
 * Generated code DO NOT EDIT
 * Generated file: HqgroupUsageRedirectMapDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a HqgroupUsageRedirectMapDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class HqgroupUsageRedirectMapDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilter;
  protected Date HGURMDLCeaseDate;
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqgroupUsageRedirectMapDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilterIn, Date HGURMDLCeaseDateIn) {
    super(id, context, "HqgroupUsageRedirectMapDeleteList");
    HqGroupUsageRedirectMapFilter = HqGroupUsageRedirectMapFilterIn;
    HGURMDLCeaseDate = HGURMDLCeaseDateIn;
  }

  public void translateToMap() {
    if (HqGroupUsageRedirectMapFilter != null) {
      Integer index =  HqGroupUsageRedirectMapFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupUsageRedirectMapFilter", HqGroupUsageRedirectMapObjectHelper.toMap(HqGroupUsageRedirectMapFilter, new HashMap(), "Void").get("Void"));
    }
    if (HGURMDLCeaseDate != null) {
      addInput("HGURMDLCeaseDate", HGURMDLCeaseDate);
    }
  }


/**
 *
 * Sets the HqGroupUsageRedirectMapFilter
 * @param HqGroupUsageRedirectMapFilterIn Value of the HqGroupUsageRedirectMapFilter
 *
 */

  public void setHqGroupUsageRedirectMapFilter(HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilterIn) {
    HqGroupUsageRedirectMapFilter = HqGroupUsageRedirectMapFilterIn;
  }

/**
 *
 * Sets the HGURMDLCeaseDate
 * @param HGURMDLCeaseDateIn Value of the HGURMDLCeaseDate
 *
 */

  public void setHGURMDLCeaseDate(Date HGURMDLCeaseDateIn) {
    HGURMDLCeaseDate = HGURMDLCeaseDateIn;
  }

  public void translateFromMap() {
    HqGroupUsageRedirectMapFilter = HqGroupUsageRedirectMapObjectHelper.fromMapFilter(inputMap, "HqGroupUsageRedirectMapFilter");
    HGURMDLCeaseDate = (Date)inputMap.get("HGURMDLCeaseDate");
  }

/**
 *
 * Gets the HqGroupUsageRedirectMapFilter
 * @return Value of the HqGroupUsageRedirectMapFilter
 *
 */

  public HqGroupUsageRedirectMapObjectFilter getHqGroupUsageRedirectMapFilter( ) {
    return HqGroupUsageRedirectMapFilter;
  }

/**
 *
 * Gets the HGURMDLCeaseDate
 * @return Value of the HGURMDLCeaseDate
 *
 */

  public Date getHGURMDLCeaseDate( ) {
    return HGURMDLCeaseDate;
  }

}
