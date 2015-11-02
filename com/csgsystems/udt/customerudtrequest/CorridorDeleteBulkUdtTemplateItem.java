/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CorridorDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CorridorObjectKeyData CCDeleteIn;
  protected Date CDCeaseDate;
/**
 *
 * Constructor to create a  CorridorDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CorridorObjectKeyData CCDeleteInIn, Date CDCeaseDateIn) {
    super(id, context, "CorridorDelete");
    CCDeleteIn = CCDeleteInIn;
    CDCeaseDate = CDCeaseDateIn;
  }

  public void translateToMap() {
    if (CCDeleteIn != null) {
      CCDeleteIn.resetFlags(true, true);
      addInput("Corridor", CorridorObjectKeyHelper.toMap(CCDeleteIn, new HashMap(), "CorridorObjectKeyData").get("CorridorObjectKeyData"));
    }
    if (CDCeaseDate != null) {
      addInput("CDCeaseDate", CDCeaseDate);
    }
  }


/**
 *
 * Sets the Corridor
 * @param CCDeleteInIn Value of the CCDeleteIn
 *
 */

  public void setCorridor(CorridorObjectKeyData CCDeleteInIn) {
    CCDeleteIn = CCDeleteInIn;
  }

/**
 *
 * Sets the CDCeaseDate
 * @param CDCeaseDateIn Value of the CDCeaseDate
 *
 */

  public void setCDCeaseDate(Date CDCeaseDateIn) {
    CDCeaseDate = CDCeaseDateIn;
  }

  public void translateFromMap() {
    CCDeleteIn = CorridorObjectKeyHelper.fromMap(inputMap, "Corridor");
    CDCeaseDate = (Date)inputMap.get("CDCeaseDate");
  }

/**
 *
 * Gets the Corridor
 * @return Value of the Corridor
 *
 */

  public CorridorObjectKeyData getCorridor( ) {
    return CCDeleteIn;
  }

/**
 *
 * Gets the CDCeaseDate
 * @return Value of the CDCeaseDate
 *
 */

  public Date getCDCeaseDate( ) {
    return CDCeaseDate;
  }

}
