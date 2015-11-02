/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemIdMapDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemIdMapDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemIdMapDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemIdMapObjectFilter OpenItemIdMapFilter;
  protected Date OIIMDLCeaseDate;
/**
 *
 * Constructor to create a  OpenItemIdMapDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemIdMapDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectFilter OpenItemIdMapFilterIn, Date OIIMDLCeaseDateIn) {
    super(id, context, "OpenItemIdMapDeleteList");
    OpenItemIdMapFilter = OpenItemIdMapFilterIn;
    OIIMDLCeaseDate = OIIMDLCeaseDateIn;
  }

  public void translateToMap() {
    if (OpenItemIdMapFilter != null) {
      Integer index =  OpenItemIdMapFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OpenItemIdMapFilter", OpenItemIdMapObjectHelper.toMap(OpenItemIdMapFilter, new HashMap(), "Void").get("Void"));
    }
    if (OIIMDLCeaseDate != null) {
      addInput("InactiveDate", OIIMDLCeaseDate);
    }
  }


/**
 *
 * Sets the OpenItemIdMapFilter
 * @param OpenItemIdMapFilterIn Value of the OpenItemIdMapFilter
 *
 */

  public void setOpenItemIdMapFilter(OpenItemIdMapObjectFilter OpenItemIdMapFilterIn) {
    OpenItemIdMapFilter = OpenItemIdMapFilterIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param OIIMDLCeaseDateIn Value of the OIIMDLCeaseDate
 *
 */

  public void setInactiveDate(Date OIIMDLCeaseDateIn) {
    OIIMDLCeaseDate = OIIMDLCeaseDateIn;
  }

  public void translateFromMap() {
    OpenItemIdMapFilter = OpenItemIdMapObjectHelper.fromMapFilter(inputMap, "OpenItemIdMapFilter");
    OIIMDLCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the OpenItemIdMapFilter
 * @return Value of the OpenItemIdMapFilter
 *
 */

  public OpenItemIdMapObjectFilter getOpenItemIdMapFilter( ) {
    return OpenItemIdMapFilter;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return OIIMDLCeaseDate;
  }

}
