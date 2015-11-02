/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupsDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupsDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupsDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupsObjectFilter hgxlFilter;
  protected Date HGInactiveDate;
/**
 *
 * Constructor to create a  HqGroupsDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupsDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupsObjectFilter hgxlFilterIn, Date HGInactiveDateIn) {
    super(id, context, "HqGroupsDeleteList");
    hgxlFilter = hgxlFilterIn;
    HGInactiveDate = HGInactiveDateIn;
  }

  public void translateToMap() {
    if (hgxlFilter != null) {
      Integer index =  hgxlFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HgxlFilter", HqGroupsObjectHelper.toMap(hgxlFilter, new HashMap(), "Void").get("Void"));
    }
    if (HGInactiveDate != null) {
      addInput("HGInactiveDate", HGInactiveDate);
    }
  }


/**
 *
 * Sets the HgxlFilter
 * @param hgxlFilterIn Value of the hgxlFilter
 *
 */

  public void setHgxlFilter(HqGroupsObjectFilter hgxlFilterIn) {
    hgxlFilter = hgxlFilterIn;
  }

/**
 *
 * Sets the HGInactiveDate
 * @param HGInactiveDateIn Value of the HGInactiveDate
 *
 */

  public void setHGInactiveDate(Date HGInactiveDateIn) {
    HGInactiveDate = HGInactiveDateIn;
  }

  public void translateFromMap() {
    hgxlFilter = HqGroupsObjectHelper.fromMapFilter(inputMap, "HgxlFilter");
    HGInactiveDate = (Date)inputMap.get("HGInactiveDate");
  }

/**
 *
 * Gets the HgxlFilter
 * @return Value of the HgxlFilter
 *
 */

  public HqGroupsObjectFilter getHgxlFilter( ) {
    return hgxlFilter;
  }

/**
 *
 * Gets the HGInactiveDate
 * @return Value of the HGInactiveDate
 *
 */

  public Date getHGInactiveDate( ) {
    return HGInactiveDate;
  }

}
