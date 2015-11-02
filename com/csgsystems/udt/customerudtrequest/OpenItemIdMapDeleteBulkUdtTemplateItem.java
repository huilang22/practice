/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemIdMapDeleteBulkUdtTemplateItem.java
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
 * Class used to create a OpenItemIdMapDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class OpenItemIdMapDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OpenItemIdMapObjectKeyData OIIMDeleteIn;
  protected Date OIIMDCeaseDate;
/**
 *
 * Constructor to create a  OpenItemIdMapDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OpenItemIdMapDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectKeyData OIIMDeleteInIn, Date OIIMDCeaseDateIn) {
    super(id, context, "OpenItemIdMapDelete");
    OIIMDeleteIn = OIIMDeleteInIn;
    OIIMDCeaseDate = OIIMDCeaseDateIn;
  }

  public void translateToMap() {
    if (OIIMDeleteIn != null) {
      OIIMDeleteIn.resetFlags(true, true);
      addInput("OpenItemIdMap", OpenItemIdMapObjectKeyHelper.toMap(OIIMDeleteIn, new HashMap(), "OpenItemIdMapObjectKeyData").get("OpenItemIdMapObjectKeyData"));
    }
    if (OIIMDCeaseDate != null) {
      addInput("InactiveDate", OIIMDCeaseDate);
    }
  }


/**
 *
 * Sets the OpenItemIdMap
 * @param OIIMDeleteInIn Value of the OIIMDeleteIn
 *
 */

  public void setOpenItemIdMap(OpenItemIdMapObjectKeyData OIIMDeleteInIn) {
    OIIMDeleteIn = OIIMDeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param OIIMDCeaseDateIn Value of the OIIMDCeaseDate
 *
 */

  public void setInactiveDate(Date OIIMDCeaseDateIn) {
    OIIMDCeaseDate = OIIMDCeaseDateIn;
  }

  public void translateFromMap() {
    OIIMDeleteIn = OpenItemIdMapObjectKeyHelper.fromMap(inputMap, "OpenItemIdMap");
    OIIMDCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the OpenItemIdMap
 * @return Value of the OpenItemIdMap
 *
 */

  public OpenItemIdMapObjectKeyData getOpenItemIdMap( ) {
    return OIIMDeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return OIIMDCeaseDate;
  }

}
