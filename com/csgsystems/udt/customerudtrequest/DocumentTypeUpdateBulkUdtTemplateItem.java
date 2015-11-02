/*
 * Generated code DO NOT EDIT
 * Generated file: DocumentTypeUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a DocumentTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DocumentTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DocumentTypeObjectData DocTypeupdate_In;
/**
 *
 * Constructor to create a  DocumentTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DocumentTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DocumentTypeObjectData DocTypeupdate_InIn) {
    super(id, context, "DocumentTypeUpdate");
    DocTypeupdate_In = DocTypeupdate_InIn;
  }

  public void translateToMap() {
    if (DocTypeupdate_In != null) {
      DocTypeupdate_In.resetFlags(true, true);
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(DocTypeupdate_In, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }


/**
 *
 * Sets the DocumentType
 * @param DocTypeupdate_InIn Value of the DocTypeupdate_In
 *
 */

  public void setDocumentType(DocumentTypeObjectData DocTypeupdate_InIn) {
    DocTypeupdate_In = DocTypeupdate_InIn;
  }

  public void translateFromMap() {
    DocTypeupdate_In = DocumentTypeObjectHelper.fromMap(inputMap, "DocumentType");
  }

/**
 *
 * Gets the DocumentType
 * @return Value of the DocumentType
 *
 */

  public DocumentTypeObjectData getDocumentType( ) {
    return DocTypeupdate_In;
  }

}
