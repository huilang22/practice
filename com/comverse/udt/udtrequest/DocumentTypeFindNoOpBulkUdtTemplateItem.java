/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DocumentTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DocumentTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DocumentTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DocumentTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DocumentTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DocumentTypeObjectDataList noOpInIn) {
    super(id, context, "DocumentTypeFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = DocumentTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DocumentType", noOpIn);
      }
      addInput("DocumentType", mapList);
    }
  }
/**
 *
 * Sets the  DocumentType
 * @param noOpInIn DocumentTypeObjectDataList to set
 *
 */
  public void setDocumentType(DocumentTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DocumentType passed into the constructor
 * @return Simulated response
 *
 */
  public DocumentTypeObjectDataList getDocumentType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DocumentTypeObjectHelper.fromMapList(inputMap, "DocumentTypeList");
  }
}
