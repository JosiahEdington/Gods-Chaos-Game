import { TestBed } from '@angular/core/testing';

import { AppResponseService } from './app-responses.service';

describe('HomeService', () => {
  let service: AppResponseService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AppResponseService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
