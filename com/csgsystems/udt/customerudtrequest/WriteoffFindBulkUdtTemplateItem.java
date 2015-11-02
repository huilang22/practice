/*
 * Generated code DO NOT EDIT
 * Generated file: WriteoffFindBulkUdtTemplateItem.java
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
 * Class used to create a WriteoffFindBulkUdtTemplateItem Bulk Template
 *
 */

public class WriteoffFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WriteoffObjectFilter WRITEOFFfindIn;
/**
 *
 * Constructor to create a  WriteoffFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WriteoffFindBulkUdtTemplateItem(String id, BSDMSessionContext context, WriteoffObjectFilter WRITEOFFfindInIn) {
    super(id, context, "WriteoffFind");
    WRITEOFFfindIn = WRITEOFFfindInIn;
  }

  public void translateToMap() {
    if (WRITEOFFfindIn != null) {
      Integer index =  WRITEOFFfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Writeoff", WriteoffObjectHelper.toMap(WRITEOFFfindIn, new HashMap(), "Writeoff").get("Writeoff"));
    }
  }


/**
 *
 * Sets the Writeoff
 * @param WRITEOFFfindInIn Value of the WRITEOFFfindIn
 *
 */

  public void setWriteoff(WriteoffObjectFilter WRITEOFFfindInIn) {
    WRITEOFFfindIn = WRITEOFFfindInIn;
  }

  public void translateFromMap() {
    WRITEOFFfindIn = WriteoffObjectHelper.fromMapFilter(inputMap, "Writeoff");
  }

/**
 *
 * Gets the Writeoff
 * @return Value of the Writeoff
 *
 */

  public WriteoffObjectFilter getWriteoff( ) {
    return WRITEOFFfindIn;
  }

}
